
package application;

public class Height {
String mHeight;
String fHeight;



Height(String motherHeight, String fatherHeight){
mHeight = motherHeight;
fHeight = fatherHeight;
}
String predictHeight() {
String bHeight = "";
boolean valueOkay = true;

char[] mArray = mHeight.toCharArray();
for(char m:mArray) {
if (!Character.isDigit(m)) {
valueOkay=false;
}
}

char[] fArray = fHeight.toCharArray();
for(char f:fArray) {
if (!Character.isDigit(f)) {
valueOkay=false;
}
}

if (valueOkay){
int mInt = Integer.parseInt(mHeight);
int fInt = Integer.parseInt(fHeight);
int bInt = (mInt + fInt)/2;
bHeight = String.valueOf(bInt);
}
else {
bHeight = "0";
}

bHeight = bHeight+" cm";
return bHeight;

}

}



