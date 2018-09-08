package info.camposha.mrexpandable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    /**
     * Our onCreate method.
     * - @param savedInstanceState - a Bundle object to hold our Object state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(MainActivity.class.getSimpleName());

        final RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,0));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        final List<Pioneer> pioneers = new ArrayList<>();
        pioneers.add(new Pioneer("0 Atanasoff John Vincent",
                "John V. Atanasoff is considered by many historians to be" +
                        "the inventor of the modern electronic computer. He was" +
                        "born October 4, 1903, in Hamilton, New York. As a young" +
                        "man, Atanasoff showed considerable interest in and a talent" +
                        "for electronics. His academic background (B.S. in electrical" +
                        "engineering, Florida State University, 1925; m.S. in mathematics, Iowa State College, 1926; and Ph.D. in experimental" +
                        "physics, University of Wisconsin, 1930) well equipped him" +
                        "for the design of computing devices.  "));
        pioneers.add(new Pioneer("1 Andreessen Marc",
                " marc Andreessen brought the World Wide Web and its" +
                        "wealth of information, graphics, and services to the desktop, setting the stage for the first “e-commerce” revolution" +
                        "of the later 1990s. As founder of Netscape, Andreessen also"));
        pioneers.add(new Pioneer("2 Amdahl Gene Myron",
                "gene Amdahl played a major role in designing and developing the mainframe computer that dominated data processing through the 1970s (see mainfRame). Amdahl was born" +
                        "on November 16, 1922, in Flandreau, South Dakota. After" +
                        "having his education interrupted by World War II, Amdahl" +
                        "received a B.S. from South Dakota State University in 1948" +
                        "and a Ph.D. in physics at the University of Wisconsin in" +
                        "1952. "));
        pioneers.add(new Pioneer("3 Aiken Howard",
                " Howard Hathaway Aiken was a pioneer in the development" +
                        "of automatic calculating machines. Born on march 8, 1900," +
                        "in Hoboken, New Jersey, he grew up in Indianapolis, Indiana, where he pursued his interest in electrical engineering" +
                        "by working at a utility company while in high school. He" +
                        "earned a B.A. in electrical engineering in 1923 at the University of Wisconsin. "));
        pioneers.add(new Pioneer("4 Babbage Charles",
                " Charles Babbage made wide-ranging applications of mathematics to a variety of fields including economics, social" +
                "statistics, and the operation of railroads and lighthouses." +
                "Babbage is best known, however, for having conceptualized" +
                "the key elements of the general-purpose computer about a" +
                "century before the dawn of electronic digital computing."));
        pioneers.add(new Pioneer("5 Bell, C. Gordon",
                "Chester gordon Bell (also known as gordon Bennet Bell)" +
                        "was born August 19, 1934, in Kirksville, missouri. As a" +
                        "young boy Bell worked in his father’s electrical contracting" +
                        "business, learning to repair appliances and wire circuits." +
                        "This work led naturally to an interest in electronics, and" +
                        "Bell studied electrical engineering at mIT, earning a B.S. in" +
                        "1956 and an m.S. in 1957. After graduation and a year spent" +
                        "as a Fulbright Scholar in Australia, Bell worked in the mIT" +
                        "Speech Computation Laboratory (see speech Recognition" +
                        "and synthesis). In 1960 he was invited to join the Digital" +
                        "Equipment Corporation (DEC) by founders Ken Olsen and" +
                        "Harlan Anderson. "));
        pioneers.add(new Pioneer("6 Berners-Lee Tim",
                "A graduate of Oxford University, Tim Berners-Lee created" +
                        "what would become the World Wide Web in 1989 while" +
                        "working at CERN, the giant European physics research" +
                        "institute. At CERN, he struggled with organizing the dozens of incompatible computer systems and software that\n" +
                        "had been brought to the labs by thousands of scientists" +
                        "from around the world. With existing systems each requiring a specialized access procedure, researchers had little\n" +
                        "hope of finding out what their colleagues were doing or of" +
                        "learning about existing software tools that might solve their" +
                        "problems.  "));
        pioneers.add(new Pioneer("7 Bezos, Jeffrey P.",
                " With its ability to display extensive information and interact" +
                        "with users, the World Wide Web of the mid-1990s clearly" +
                        "had commercial possibilities. But it was far from clear how" +
                        "traditional merchandising could be adapted to the online" +
                        "world, and how the strengths of the new medium could be" +
                        "translated into business advantages. In creating Amazon." +
                        "com, “the world’s largest bookstore,” Jeff Bezos would show" +
                        "how the Web could be used to deliver books and other merchandise to millions of consumers. "));
        recyclerView.setAdapter(new MyRecyclerAdapter(pioneers));
    }
}
//end