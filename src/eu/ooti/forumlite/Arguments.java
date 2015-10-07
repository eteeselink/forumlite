package eu.ooti.forumlite;


import com.github.jankroken.commandline.annotations.LongSwitch;
import com.github.jankroken.commandline.annotations.Option;
import com.github.jankroken.commandline.annotations.ShortSwitch;
import com.github.jankroken.commandline.annotations.SingleArgument;

/**
 * Created by VChembay on 10/8/2015.
 * Model for arguments, which will be passed as program arguments
 */
public class Arguments {

    public Arguments() {
    }

    private String filename;
    private String word;

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
}
