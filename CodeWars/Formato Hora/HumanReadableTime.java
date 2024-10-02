public class HumanReadableTime {

  public static void main(String[] args) {
    System.out.println(makeReadable(59));
  }

  public static String makeReadable(int seconds) {
    int h = 0;
    int m = 0;
    int s = 0;
    if (seconds < 59) {
      s = seconds;
    } else if (seconds < 3600) {
      m = seconds / 60;
      s = seconds % 60;
    } else if (seconds < 356401) {
      h = seconds / 3600;
      m = (seconds / 60) % 60;
      s = seconds % 60;
    }

    String hStr = h > 9 ? String.valueOf(h) : "0".concat(String.valueOf(h));
    System.out.println("h " + hStr);

    String mStr = m > 9 ? String.valueOf(m) : "0".concat(String.valueOf(m));
    System.out.println("m " + mStr);

    String sStr = s > 9 ? String.valueOf(s) : "0".concat(String.valueOf(s));
    System.out.println("s " + sStr);
    
    String format = hStr + ":" + mStr + ":" + sStr;
    
    return format;
  }
}