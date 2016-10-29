package zyk.spring;


class HelloIndia {
    private String message;

    public String getMessage() {
        System.out.printf("Your message name %s %s\n", name, message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String name;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void test() {
        System.out.printf("this is a test function");
    }

    public void init() {
        System.out.println("init ok");
    }

    public void destory() {
        System.out.println("destory ok");
    }
}
