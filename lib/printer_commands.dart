class PrinterCommands {
  static final int HT = 0x09;
  static final int LF = 0x0A;
  static final int CR = 0x0D;
  static final int ESC = 0x1B;
  static final int DLE = 0x10;
  static final int GS = 0x1D;
  static final int FS = 0x1C;
  static final int CAN = 0x18;
  static final int EOT = 0x04;
  static final int NULL = 0x00;

  static final List<int> FEED_LINE = [LF];

  static final List<int> SELECT_FONT_A = [ESC, 0x4D, 0x00];

  static final List<int> SET_BAR_CODE_HEIGHT = [GS, 0x68];
  static final List<int> PRINT_UPCE_BAR_CODE = [GS, 0x6A, 0x02];
  static final List<int> SEND_NULL_BYTE = [NULL];

  static final List<int> SELECT_PRINT_SHEET = [ESC, 0x63, 0x30, 0x02];
  static final List<int> FEED_PAPER_AND_CUT = [GS, 0x56, 0x42, 0x00];

  static final List<int> SELECT_CYRILLIC_CHARACTER_CODE_TABLE = [
    ESC,
    0x74,
    0x11
  ];

  static final List<int> SELECT_BIT_IMAGE_MODE = [ESC, 0x2A, 0x21, 0xFF, 0x00];
  static final List<int> SET_LINE_SPACING = [ESC, 0x33];

  static final List<int> TRANSMIT_DLE_PRINTER_STATUS = [DLE, EOT, 0x01];
  static final List<int> TRANSMIT_DLE_OFFLINE_PRINTER_STATUS = [DLE, EOT, 0x02];
  static final List<int> TRANSMIT_DLE_ERROR_STATUS = [DLE, EOT, 0x03];
  static final List<int> TRANSMIT_DLE_ROLL_PAPER_SENSOR_STATUS = [
    DLE,
    EOT,
    0x04
  ];

  static final List<int> ESC_FONT_COLOR_DEFAULT = [ESC, 0x72, 0x00];
  static final List<int> FS_FONT_ALIGN = [FS, 0x21, 0x01, 0x1B, 0x21, 0x01];
  static final List<int> ESC_ALIGN_LEFT = [ESC, 0x61, 0x00];
  static final List<int> ESC_ALIGN_RIGHT = [ESC, 0x61, 0x02];
  static final List<int> ESC_ALIGN_CENTER = [ESC, 0x61, 0x01];
  static final List<int> ESC_CANCEL_BOLD = [ESC, 0x45, 0x00];

  /*********************************************/
  static final List<int> ESC_HORIZONTAL_CENTERS = [ESC, 0x44, 0x14, 0x1C, 0x00];
  static final List<int> ESC_CANCLE_HORIZONTAL_CENTERS = [ESC, 0x44, 0x00];
  /*********************************************/

  /*********** Open Cash Drawer ****************/
  static final List<int> ESC_DRAWER_PIN2 = [ESC, 0x70, 0x30];
  static final List<int> ESC_DRAWER_PIN5 = [ESC, 0x70, 0x31];
  /*********************************************/

  static final List<int> ESC_ENTER = [ESC, 0x4A, 0x40];
  static final List<int> PRINTE_TEST = [GS, 0x28, 0x41];

  /**************** Encoding *******************/
  static final List<int> ENC_ESP1 = [ESC, 0x52, 0x07]; //Bixolon esp1
  static final List<int> ENC_ESP2 = [ESC, 0x52, 0x0B]; //Bixolon esp2
  static final List<int> ENC_LAT1 = [ESC, 0x74, 0x10]; //Bixolon lat1
  static final List<int> ENC_LAT9 = [ESC, 0x74, 0x30]; //Bixolon lat9
  /*********************************************/

  /**************** Control *******************/
  static final List<int> INIT_SEQ = [ESC, 0x40];
  /*********************************************/
}
