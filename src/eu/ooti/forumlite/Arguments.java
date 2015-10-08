package eu.ooti.forumlite;


import com.github.jankroken.commandline.annotations.*;

/**
 * Created by VChembay on 10/8/2015.
 * Model for arguments, which will be passed as program arguments
 */
public class Arguments {

    public Arguments() {
    }

    private String filename;
    private String word;
    private boolean alarm = false;

    @Option
    @LongSwitch("alarm")
    @ShortSwitch("a")
    @Toggle(true)
    public void setDebug(boolean alarm) {
        this.alarm = alarm;
    }

    @Option
    @LongSwitch("file")
    @ShortSwitch("f")
    @SingleArgument
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public String getWord() {
        return word;
    }

    @Option
    @LongSwitch("word")
    @ShortSwitch("w")
    @SingleArgument
    public void setWord(String word) {
        this.word = word;
    }

    public boolean isAlarm() {
        return alarm;
    }
}
