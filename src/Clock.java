public class Clock {

    private int second;
    private int min;
    private int hour;

    private int totalSecond;

    public Clock(int totalSecond){
        this.totalSecond = totalSecond;

        this.hour = this.totalSecond / 3600;
        this.totalSecond %= 3600;
        this.min = this.totalSecond / 60;
        this.second = this.totalSecond % 60;
    }

    public Clock(int hour, int min, int second){
        this.hour = hour;
        this.min = min;
        this.second = second;
    }
    public int tick(){
        return (second += 1);
    }

    public int timeInSeconds(){
        return hour*3600 + min*60 + second;
    }

    public void displayTime(){

        System.out.println("The time is:");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(min);
        System.out.print(":");
        System.out.println(second);

    }

    public static void main(String[] args){
        Clock clock = new Clock(5112);
        Clock clock2 = new Clock(1,25,12);
        clock.displayTime();
        clock2.displayTime();
        System.out.println(clock2.timeInSeconds());
    }
}
