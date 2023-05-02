package id.kakzaki.blue_thermal_printer;

/**
 * Created by https://goo.gl/UAfmBd on 2/6/2017.
 */

public class PrinterCommands {
    public static final byte HT = 0x09;
    public static final byte LF = 0x0A;
    public static final byte CR = 0x0D;
    public static final byte ESC = 0x1B;
    public static final byte DLE = 0x10;
    public static final byte GS = 0x1D;
    public static final byte FS = 0x1C;
    public static final byte CAN = 0x18;
    public static final byte EOT = 0x04;
    public static final byte NULL = 0x00;

    public static final byte[] FEED_LINE = {LF};

    public static final byte[] SELECT_FONT_A = {ESC, 0x4D, 0x00};

    public static final byte[] SET_BAR_CODE_HEIGHT = {GS, 0x68};
    public static final byte[] PRINT_UPCE_BAR_CODE = {GS, 0x6A, 0x02};
    public static final byte[] SEND_NULL_BYTE = {NULL};

    public static final byte[] SELECT_PRINT_SHEET = {ESC, 0x63, 0x30, 0x02};
    public static final byte[] FEED_PAPER_AND_CUT = {GS, 0x56, 0x42, 0x00};

    public static final byte[] SELECT_CYRILLIC_CHARACTER_CODE_TABLE = {ESC, 0x74, 0x11};

    public static final byte[] SELECT_BIT_IMAGE_MODE = {ESC, 0x2A, 0x21, 0xFF, 0x00 }; //{0x1B, 0x2A, 33, 0, 2};
    public static final byte[] SET_LINE_SPACING = {ESC, 0x33};

    public static final byte[] TRANSMIT_DLE_PRINTER_STATUS = {DLE, EOT, 0x01};
    public static final byte[] TRANSMIT_DLE_OFFLINE_PRINTER_STATUS = {DLE, EOT, 0x02};
    public static final byte[] TRANSMIT_DLE_ERROR_STATUS = {DLE, EOT, 0x03};
    public static final byte[] TRANSMIT_DLE_ROLL_PAPER_SENSOR_STATUS = {DLE, EOT, 0x04};

    public static final byte[] ESC_FONT_COLOR_DEFAULT = new byte[] { ESC, 0x72,0x00 };
    public static final byte[] FS_FONT_ALIGN = new byte[] { FS, 0x21, 0x01, 0x1B,
            0x21, 0x01 };
    public static final byte[] ESC_ALIGN_LEFT = new byte[] { ESC, 0x61, 0x00 };
    public static final byte[] ESC_ALIGN_RIGHT = new byte[] { ESC, 0x61, 0x02 };
    public static final byte[] ESC_ALIGN_CENTER = new byte[] { ESC, 0x61, 0x01 };
    public static final byte[] ESC_CANCEL_BOLD = new byte[] { ESC, 0x45, 0x00 };


    /*********************************************/
    public static final byte[] ESC_HORIZONTAL_CENTERS = new byte[] { ESC, 0x44, 0x14, 0x1C, 0x00};
    public static final byte[] ESC_CANCLE_HORIZONTAL_CENTERS = new byte[] { ESC, 0x44, 0x00 };
    /*********************************************/

    /*********** Open Cash Drawer ****************/    
    public static final byte[] ESC_DRAWER_PIN2 = new byte[] { ESC, 0x70, 0x30 };
    public static final byte[] ESC_DRAWER_PIN5 = new byte[] { ESC, 0x70, 0x31 };
    /*********************************************/

    public static final byte[] ESC_ENTER = new byte[] { ESC, 0x4A, 0x40 };
    public static final byte[] PRINTE_TEST = new byte[] { GS, 0x28, 0x41 };

    /**************** Encoding *******************/
    static final byte [] ENC_ESP1 = new byte[] {ESC, 0x52, 0x07}; //Bixolon esp1
    static final byte [] ENC_ESP2 = new byte[] {ESC, 0x52, 0x0B}; //Bixolon esp2
    static final byte [] ENC_LAT1 = new byte[] {ESC, 0x74, 0x10}; //Bixolon lat1
    static final byte [] ENC_LAT9 = new byte[] {ESC, 0x74, 0x30}; //Bixolon lat9
    /*********************************************/

    /**************** Control *******************/
    static final byte[] INIT_SEQ = new byte[] {ESC, 0x40};
    /*********************************************/
}