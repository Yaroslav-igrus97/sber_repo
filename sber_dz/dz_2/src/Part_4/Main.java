package Part_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document();
        Document d3 = new Document();
        Document d4 = new Document();

        List<Document> documents = new ArrayList<>();
        documents.add(d1);
        documents.add(d2);
        documents.add(d3);
        documents.add(d4);

        System.out.println(organiseDocuments(documents));
    }

    public static Map<Integer, Document> organiseDocuments(List<Document> documents){
        Map<Integer, Document> res = new HashMap<>();
        int id = 0;
        for(Document i : documents){
            res.put(id, i);
            id ++;
        }
        return res;
    }
}
