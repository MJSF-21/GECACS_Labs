import java.io.DataInputStream;
import java.io.IOException;

class Practical1 {
    public static void main(String args[]) throws IOException {

        int time;
        DataInputStream dis = new DataInputStream(System.in);

        System.out.print("Enter a Time: ");
        time = Integer.parseInt(dis.readLine());

        System.out.println("Time is: " + new Time(time).getTime());
    }
}

class Time {

    int hours;
    int minutes;
    int seconds;
    int time;

    public Time(int t) {

        time = t;

        while (time > 0) {

            if (time / 3600 > 0) {
                hours++;
                time = time - 3600;
            }
            else if (time / 60 > 0) {
                minutes++;
                time = time - 60;
            }
            else {
                seconds = time;
                break;
            }
        }
    }

    public String getTime() {

        String ans = "";

        if (hours > 9) {
            if (minutes > 9) {
                if (seconds > 9) {
                    ans = "" + hours + ":" + minutes + ":" + seconds;
                } else {
                    ans = "" + hours + ":" + minutes + ":0" + seconds;
                }
            } else {
                if (seconds > 9) {
                    ans = "" + hours + ":0" + minutes + ":" + seconds;
                } else {
                    ans = "" + hours + ":0" + minutes + ":0" + seconds;
                }
            }
        }
        else {
            if (minutes > 9) {
                if (seconds > 9) {
                    ans = "0" + hours + ":" + minutes + ":" + seconds;
                } else {
                    ans = "0" + hours + ":" + minutes + ":0" + seconds;
                }
            }
            else {
                if (seconds > 9) {
                    ans = "0" + hours + ":0" + minutes + ":" + seconds;
                } else {
                    ans = "0" + hours + ":0" + minutes + ":0" + seconds;
                }
            }
        }

        return ans;
    }
}