package id.kakzaki.blue_thermal_printer;

/**
 * Created by https://goo.gl/UAfmBd on 2/6/2017.
 */

 import PrinterCharacterCodePages;

public class PrinterCommands {

    //region Root Commands
    public static final byte HT = 0x09;
    public static final byte LF = 0x0A;
    public static final byte CR = 0x0D;
    public static final byte ESC = 0x1B;
    public static final byte DLE = 0x10;
    public static final byte GS = 0x1D;
    public static final byte FS = 0x1C;
    public static final byte CAN = 0x18;
    public static final byte EOT = 0x04;
    public static final byte FF = 0x0C;
    //endregion

    public static final byte[] INIT = {ESC, 0x40};
    public static final byte[] HORIZONTAL_TAB = {HT};
    public static final byte[] FEED_LINE = {LF};
    public static final byte[] WRITELN = {LF};
    public static final byte[] FORM_FEED = {FF};
    
    public static final byte[] CANCEL = {CAN};

    public static final byte[] SELECT_FONT_A = {20, 33, 0};

    public static final byte[] SET_BAR_CODE_HEIGHT = {GS, 104, 100};
    public static final byte[] PRINT_BAR_CODE_1 = {GS, 107, 2};
    public static final byte[] SEND_NULL_BYTE = {0x00};

    public static final byte[] SELECT_PRINT_SHEET = {ESC, 0x63, 0x30, 0x02};
    public static final byte[] FEED_PAPER_AND_CUT = {GS, 0x56, 66, 0x00};

    public static final byte[] SELECT_BIT_IMAGE_MODE = { ESC, 0x2A, 33, 0xFF, 0 }; //{0x1B, 0x2A, 33, 0, 2};
    public static final byte[] SET_LINE_SPACING_24 = {ESC, 0x33, 24};
    public static final byte[] SET_LINE_SPACING_30 = {ESC, 0x33, 30};

    public static final byte[] TRANSMIT_DLE_PRINTER_STATUS = {DLE, EOT, 0x01};
    public static final byte[] TRANSMIT_DLE_OFFLINE_PRINTER_STATUS = {DLE, EOT, 0x02};
    public static final byte[] TRANSMIT_DLE_ERROR_STATUS = {DLE, EOT, 0x03};
    public static final byte[] TRANSMIT_DLE_ROLL_PAPER_SENSOR_STATUS = {DLE, EOT, 0x04};

    public static final byte[] ESC_FONT_COLOR_DEFAULT = new byte[] { ESC, 'r',0x00 };
    public static final byte[] FS_FONT_ALIGN = new byte[] { FS, 0x21, 1, 0x1B, 0x21, 1 };
    public static final byte[] ESC_ALIGN_LEFT = new byte[] { ESC, 'a', 0x00 };
    public static final byte[] ESC_ALIGN_RIGHT = new byte[] { ESC, 'a', 0x02 };
    public static final byte[] ESC_ALIGN_CENTER = new byte[] { ESC, 'a', 0x01 };
    public static final byte[] ESC_CANCEL_BOLD = new byte[] { ESC, 0x45, 0 };

    /*********************************************/
    public static final byte[] ESC_HORIZONTAL_CENTERS = new byte[] { ESC, 0x44, 20, 28, 00};
    public static final byte[] ESC_CANCLE_HORIZONTAL_CENTERS = new byte[] { ESC, 0x44, 00 };
    /*********************************************/

    /*********** Open Cash Drawer ****************/    
    public static final byte[] ESC_DRAWER_PIN2 = new byte[] { ESC, 'p', 0x30 };
    public static final byte[] ESC_DRAWER_PIN5 = new byte[] { ESC, 'p', 0x31 };
    /*********************************************/

    public static final byte[] ESC_ENTER = new byte[] { ESC, 0x4A, 0x40 };
    public static final byte[] PRINTE_TEST = new byte[] { GS, 0x28, 0x41 };

    /**************** Encoding *******************/
    static final byte [] ENC_ESP1 = new byte[] {ESC, 0x52, 0x07};                   //Bixolon esp1
    static final byte [] ENC_ESP2 = new byte[] {ESC, 0x52, 0x0B};                   //Bixolon esp2
    static final byte [] ENC_LAT1 = new byte[] {ESC, 0x74, PAGE_1252_LATIN_1};      //Bixolon lat1
    static final byte [] ENC_LAT2 = new byte[] {ESC, 0x74, PAGE_852_LATIN_2};       //Bixolon lat2
    static final byte [] ENC_LAT9 = new byte[] {ESC, 0x74, PAGE_LATIN_9};           //Bixolon lat9
    static final byte [] ENC_CYR2 = new byte[] {ESC, 0x74, PAGE_866_CYRILLIC_2};    //Bixolon cyr2
    /*********************************************/


    //region Static Methods
    public static byte[] set_character_right_space(byte spaces)
    {
        byte[] byteCommand =  {ESC, 0x20, spaces};
        return byteCommand;
    }

    public static byte[] set_char_code_page(byte codePage)
    {
        byte[] byteCommand = {ESC, 0x74, codePage};
        return byteCommand;
    }

    public static byte print_bitmap(byte[] bitmap, int width, int height)
    {
        if(width > 384) throw new Exception("Image is superior to 384px wide");
        if(height > 1662) throw new Exception("Image is superior to 1662px high");
        byte[] byteCommand = {GS, 0x76, 0x30, 0x00, width & 0xFF, width >> 8, height & 0xFF, height >> 8};
        return ByteStream.concat(Arrays.stream(byteCommand), Arrays.stream(bitmap)).toArray();
    }

    //endregion
}