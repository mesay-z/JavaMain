package enumPractice;

public class Week {
    Days days;
    public Week() {
    }

    public Week(Days days) {
        this.days = days;
    }

    public void whatToDo() {
        switch (days) {
            case Saturday:
                System.out.println("am gone go work");
                break;
            case Monday:
                System.out.println("am gone go ethiopian restorunt");
                break;
            case Wednesday:
            case Thursday:
            case Sunday:
                System.out.println("am gone go church");
                break;
            case Friday:
            case Tuesday:
                System.out.println("am gone go class");
                break;
        }
    }
}
