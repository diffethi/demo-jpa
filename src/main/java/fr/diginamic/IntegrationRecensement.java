package fr.diginamic;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegrationRecensement {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Users/FUJITSU User/Downloads/recensement.xlsx");
        /*boolean estLisible = Files.isReadable(path);
        System.out.println(estLisible);
        */


        List<String> lines = new ArrayList<>();


        Path pathCible = Paths.get(lines);
        Files.read(pathCible, lines);




    }
}
