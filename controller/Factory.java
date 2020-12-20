package controller;

import executors.Executable;
import executors.impl.BasicFormatExecutor;
import maper.impl.JsonModelToStringConverter;
import maper.impl.XmlModelConverter;
import utils.Constants;

public class Factory {

    private final Executable jsonExecutable = new BasicFormatExecutor(new JsonModelToStringConverter());
    private final Executable xmlExecutable = new BasicFormatExecutor(new XmlModelConverter());

    public Executable getInstanceByFormat(String format) {
        Executable result;
        switch (format) {
            case Constants.JSON: //Спросить, нужен ли бинарный кейс
                result = jsonExecutable;
            case Constants.XML:
                result = xmlExecutable;
            default:
                result = null;
        }
        return result;
    }
}
