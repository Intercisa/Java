package app;

import model.Tsv;
import parser.Parser;
import parser.TsvParser;

public class App {
    public static void main(String[] args) {
        Parser<Tsv> parser = new TsvParser();
        System.out.println(parser.parse("USGS\t13206000\t2021-12-30 14:30\tMST\t226\tP"));
    }
}
