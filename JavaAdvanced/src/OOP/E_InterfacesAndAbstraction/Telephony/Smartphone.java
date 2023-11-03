package OOP.E_InterfacesAndAbstraction.Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();

        for (String url : urls) {
            boolean isValid = true;

            for (int i = 0; i < url.length(); i++) {
                if (Character.isDigit(url.charAt(i))) {
                    sb.append("Invalid URL!\n");
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                sb.append(String.format("Browsing: %s!\n", url));
            }
        }
        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();

        for (String num : numbers) {
            boolean isValid = true;

            for (int i = 0; i < num.length(); i++) {
                if (!Character.isDigit(num.charAt(i))) {
                    sb.append("Invalid number!\n");
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                sb.append(String.format("Calling... %s\n", num));
            }
        }

        return sb.toString();
    }
}
