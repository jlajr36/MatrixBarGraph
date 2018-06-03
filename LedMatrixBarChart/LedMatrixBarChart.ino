#include "LedControl.h"

LedControl lc = LedControl(12,11,10,1);

int chatIn = 0;
byte pattern[9]={B00000000,
                 B00000001,
                 B00000011,
                 B00000111,
                 B00001111,
                 B00011111,
                 B00111111,
                 B01111111,
                 B11111111};

void setup() {
  Serial.begin(9600);
  lc.shutdown(0, false);
  lc.setIntensity(0,8);
  lc.clearDisplay(0);
}

void loop() {
  if (Serial.available()) {
    chatIn = Serial.read();
    Serial.println(chatIn);
    switch(chatIn) {
      
      //Column 1****************************
      case 33:
        lc.setRow(0,0,pattern[0]);
        break;
      case 34:
        lc.setRow(0,0,pattern[1]);
        break;
      case 35:
        lc.setRow(0,0,pattern[2]);
        break;
      case 36:
        lc.setRow(0,0,pattern[3]);
        break;
      case 37:
        lc.setRow(0,0,pattern[4]);
        break;
      case 38:
        lc.setRow(0,0,pattern[5]);
        break;
      case 39:
        lc.setRow(0,0,pattern[6]);
        break;
      case 40:
        lc.setRow(0,0,pattern[7]);
        break;
      case 41:
        lc.setRow(0,0,pattern[8]);
        break;
      
      //Column 2****************************
      case 42:
        lc.setRow(0,1,pattern[0]);
        break;
      case 43:
        lc.setRow(0,1,pattern[1]);
        break;
      case 44:
        lc.setRow(0,1,pattern[2]);
        break;
      case 45:
        lc.setRow(0,1,pattern[3]);
        break;
      case 46:
        lc.setRow(0,1,pattern[4]);
        break;
      case 47:
        lc.setRow(0,1,pattern[5]);
        break;
      case 48:
        lc.setRow(0,1,pattern[6]);
        break;
      case 49:
        lc.setRow(0,1,pattern[7]);
        break;
      case 50:
        lc.setRow(0,1,pattern[8]);
        break;
      
      //Column 3****************************
      case 51:
        lc.setRow(0,2,pattern[0]);
        break;
      case 52:
        lc.setRow(0,2,pattern[1]);
        break;
      case 53:
        lc.setRow(0,2,pattern[2]);
        break;
      case 54:
        lc.setRow(0,2,pattern[3]);
        break;
      case 55:
        lc.setRow(0,2,pattern[4]);
        break;
      case 56:
        lc.setRow(0,2,pattern[5]);
        break;
      case 57:
        lc.setRow(0,2,pattern[6]);
        break;
      case 58:
        lc.setRow(0,2,pattern[7]);
        break;
      case 59:
        lc.setRow(0,2,pattern[8]);
        break;

      //Column 4****************************
      case 60:
        lc.setRow(0,3,pattern[0]);
        break;
      case 61:
        lc.setRow(0,3,pattern[1]);
        break;
      case 62:
        lc.setRow(0,3,pattern[2]);
        break;
      case 63:
        lc.setRow(0,3,pattern[3]);
        break;
      case 64:
        lc.setRow(0,3,pattern[4]);
        break;
      case 65:
        lc.setRow(0,3,pattern[5]);
        break;
      case 66:
        lc.setRow(0,3,pattern[6]);
        break;
      case 67:
        lc.setRow(0,3,pattern[7]);
        break;
      case 68:
        lc.setRow(0,3,pattern[8]);
        break;
        
      //Column 5****************************
      case 69:
        lc.setRow(0,4,pattern[0]);
        break;
      case 70:
        lc.setRow(0,4,pattern[1]);
        break;
      case 71:
        lc.setRow(0,4,pattern[2]);
        break;
      case 72:
        lc.setRow(0,4,pattern[3]);
        break;
      case 73:
        lc.setRow(0,4,pattern[4]);
        break;
      case 74:
        lc.setRow(0,4,pattern[5]);
        break;
      case 75:
        lc.setRow(0,4,pattern[6]);
        break;
      case 76:
        lc.setRow(0,4,pattern[7]);
        break;
      case 77:
        lc.setRow(0,4,pattern[8]);
        break;
      
      //Column 6****************************
      case 78:
        lc.setRow(0,5,pattern[0]);
        break;
      case 79:
        lc.setRow(0,5,pattern[1]);
        break;
      case 80:
        lc.setRow(0,5,pattern[2]);
        break;
      case 81:
        lc.setRow(0,5,pattern[3]);
        break;
      case 82:
        lc.setRow(0,5,pattern[4]);
        break;
      case 83:
        lc.setRow(0,5,pattern[5]);
        break;
      case 84:
        lc.setRow(0,5,pattern[6]);
        break;
      case 85:
        lc.setRow(0,5,pattern[7]);
        break;
      case 86:
        lc.setRow(0,5,pattern[8]);
        break;
      
      //Column 7****************************
      case 87:
        lc.setRow(0,6,pattern[0]);
        break;
      case 88:
        lc.setRow(0,6,pattern[1]);
        break;
      case 89:
        lc.setRow(0,6,pattern[2]);
        break;
      case 90:
        lc.setRow(0,6,pattern[3]);
        break;
      case 91:
        lc.setRow(0,6,pattern[4]);
        break;
      case 92:
        lc.setRow(0,6,pattern[5]);
        break;
      case 93:
        lc.setRow(0,6,pattern[6]);
        break;
      case 94:
        lc.setRow(0,6,pattern[7]);
        break;
      case 95:
        lc.setRow(0,6,pattern[8]);
        break;

      //Column 8****************************
      case 96:
        lc.setRow(0,7,pattern[0]);
        break;
      case 97:
        lc.setRow(0,7,pattern[1]);
        break;
      case 98:
        lc.setRow(0,7,pattern[2]);
        break;
      case 99:
        lc.setRow(0,7,pattern[3]);
        break;
      case 100:
        lc.setRow(0,7,pattern[4]);
        break;
      case 101:
        lc.setRow(0,7,pattern[5]);
        break;
      case 102:
        lc.setRow(0,7,pattern[6]);
        break;
      case 103:
        lc.setRow(0,7,pattern[7]);
        break;
      case 104:
        lc.setRow(0,7,pattern[8]);
        break;  
      
      default:
        //pass
        break;
    }
  }
}


