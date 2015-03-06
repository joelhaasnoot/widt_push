package nl.waarisdetrein.api.push.util;

import ndov.cdm.trein.reisinformatie.data._2.AankomstOfVertrekTijdType;
import ndov.cdm.trein.reisinformatie.data._2.DynamischeVertrekStaatType;
import ndov.cdm.trein.reisinformatie.data._2.SpoorPlannedActueelType;
import ndov.cdm.trein.reisinformatie.data._2.WijzigingType;

import javax.xml.datatype.Duration;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by joelthuis on 08/10/14.
 */
public class DvsToMessageConverter {


    private static SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm");

    public static String convertDvs(DynamischeVertrekStaatType message) {
        StringBuilder s = new StringBuilder();
        s.append("Trein ");
        s.append(message.getTrein().getTreinNummer());
        s.append(" ");
        if (message.getTrein().getWijziging().size() > 0) {
            convertWijzigingen(message, s);
        } else {
            Calendar vertrek = message.getTrein().getVertrekTijd().get(1).getValue().toGregorianCalendar();
            TIME_FORMAT.setTimeZone(vertrek.getTimeZone());
            s.append("vertrekt om "+TIME_FORMAT.format(vertrek.getTime())+" uit " + message.getRitStation().getKorteNaam());
        }
        return s.toString();
    }

    private static void convertWijzigingen(DynamischeVertrekStaatType message, StringBuilder s) {
        int i = 0;
        for (WijzigingType w :  message.getTrein().getWijziging()) {
            if (w.getWijzigingType().equals("10")) {
                Duration dur = message.getTrein().getExacteVertrekVertraging();
                s.append("heeft " + (dur.getHours()*60+dur.getMinutes()) + " min vertraging op station "+message.getRitStation().getKorteNaam());
            } else if (w.getWijzigingType().equals("20")) {
                SpoorPlannedActueelType spoor = message.getTrein().getTreinVertrekSpoor().get(1);
                String spoorStr = String.valueOf(spoor.getSpoorNummer());
                if (spoor.getSpoorFase() != null) {
                    spoorStr += spoor.getSpoorFase();
                }
                s.append("heeft een spoorwijziging op "+message.getRitStation().getKorteNaam()+" naar "+spoorStr);
            } else if (w.getWijzigingType().equals("20")) {
                s.append("heeft een spoor toegoekend gekregen op "+message.getRitStation().getKorteNaam());
            } else if (w.getWijzigingType().equals("31")) {
                s.append("stopt extra op "+message.getRitStation().getKorteNaam());
            } else if (w.getWijzigingType().equals("32")) {
                s.append("stopt niet meer op "+message.getRitStation().getKorteNaam());
            } else if (w.getWijzigingType().equals("40")) {
                if (message.getTrein().getTreinStatus().equals("2")) {
                    s.append("is aangekomen op " + message.getRitStation().getKorteNaam());
                } else if (message.getTrein().getTreinStatus().equals("5")) {
                    s.append("is vertrokken uit " + message.getRitStation().getKorteNaam());
                }
            }
            if (i < (message.getTrein().getWijziging().size()-1)) {
                s.append(" en ");
            }
            i += 1;
        }
    }

}
