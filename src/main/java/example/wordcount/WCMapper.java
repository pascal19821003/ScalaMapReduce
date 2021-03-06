package example.wordcount;

import javaMapReduce.Mapper;
import javaMapReduce.Outputer;

public class WCMapper extends Mapper {

  @Override
  public void map(String key, String value, Outputer out) {
    String line = value;
    String[] words = line.split(" ");
    
    for (String word : words) {
      out.collect(word, Long.toString(1));
    }
  }

}