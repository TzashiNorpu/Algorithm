package algo.tzashinorpu.FirstRound.Chapter09;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class LeetCode_3_126_1Test {

        @Test
        void findLadders() {
                LeetCode_3_126_1 instance = new LeetCode_3_126_1();

                System.out.println("Test1-1....");
                String beginword1 = "hit";
                String endword1 = "cog";
                String[] strings1 = { "hot", "hmt", "dot", "lit", "lig", "dog", "lot", "log", "cog" };
                List<String> wordlist1 = new LinkedList<>(Arrays.asList(strings1));
                instance.res = new LinkedList<>();
                System.out.println(instance.findLadders(beginword1, endword1, wordlist1));
                instance.res = new LinkedList<>();
                System.out.println(instance.findLadders2(beginword1, endword1, wordlist1));
                System.out.println("-----------------------------");

                System.out.println("Test1-2....");
                String beginword2 = "qa";
                String endword2 = "sq";
                String[] strings2 = { "si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln", "tm",
                                "le", "av", "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra", "fa", "yo", "ow",
                                "sn", "ya", "cr", "po", "fe", "ho", "ma", "re", "or", "rn", "au", "ur", "rh", "sr",
                                "tc", "lt", "lo", "as", "fr", "nb", "yb", "if", "pb", "ge", "th", "pm", "rb", "sh",
                                "co", "ga", "li", "ha", "hz", "no", "bi", "di", "hi", "qa", "pi", "os", "uh", "wm",
                                "an", "me", "mo", "na", "la", "st", "er", "sc", "ne", "mn", "mi", "am", "ex", "pt",
                                "io", "be", "fm", "ta", "tb", "ni", "mr", "pa", "he", "lr", "sq", "ye" };

                List<String> wordlist2 = new LinkedList<>(Arrays.asList(strings2));
                instance.res = new LinkedList<>();
                System.out.println(instance.findLadders(beginword2, endword2, wordlist2));
                instance.res = new LinkedList<>();
                System.out.println(instance.findLadders2(beginword2, endword2, wordlist2));
                System.out.println("-----------------------------");

                System.out.println("Test1-3....");
                String beginword3 = "cet";
                String endword3 = "ism";
                String[] strings3 = { "kid", "tag", "pup", "ail", "tun", "woo", "erg", "luz", "brr", "gay", "sip",
                                "kay", "per", "val", "mes", "ohs", "now", "boa", "cet", "pal", "bar", "die", "war",
                                "hay", "eco", "pub", "lob", "rue", "fry", "lit", "rex", "jan", "cot", "bid", "ali",
                                "pay", "col", "gum", "ger", "row", "won", "dan", "rum", "fad", "tut", "sag", "yip",
                                "sui", "ark", "has", "zip", "fez", "own", "ump", "dis", "ads", "max", "jaw", "out",
                                "btu", "ana", "gap", "cry", "led", "abe", "box", "ore", "pig", "fie", "toy", "fat",
                                "cal", "lie", "noh", "sew", "ono", "tam", "flu", "mgm", "ply", "awe", "pry", "tit",
                                "tie", "yet", "too", "tax", "jim", "san", "pan", "map", "ski", "ova", "wed", "non",
                                "wac", "nut", "why", "bye", "lye", "oct", "old", "fin", "feb", "chi", "sap", "owl",
                                "log", "tod", "dot", "bow", "fob", "for", "joe", "ivy", "fan", "age", "fax", "hip",
                                "jib", "mel", "hus", "sob", "ifs", "tab", "ara", "dab", "jag", "jar", "arm", "lot",
                                "tom", "sax", "tex", "yum", "pei", "wen", "wry", "ire", "irk", "far", "mew", "wit",
                                "doe", "gas", "rte", "ian", "pot", "ask", "wag", "hag", "amy", "nag", "ron", "soy",
                                "gin", "don", "tug", "fay", "vic", "boo", "nam", "ave", "buy", "sop", "but", "orb",
                                "fen", "paw", "his", "sub", "bob", "yea", "oft", "inn", "rod", "yam", "pew", "web",
                                "hod", "hun", "gyp", "wei", "wis", "rob", "gad", "pie", "mon", "dog", "bib", "rub",
                                "ere", "dig", "era", "cat", "fox", "bee", "mod", "day", "apr", "vie", "nev", "jam",
                                "pam", "new", "aye", "ani", "and", "ibm", "yap", "can", "pyx", "tar", "kin", "fog",
                                "hum", "pip", "cup", "dye", "lyx", "jog", "nun", "par", "wan", "fey", "bus", "oak",
                                "bad", "ats", "set", "qom", "vat", "eat", "pus", "rev", "axe", "ion", "six", "ila",
                                "lao", "mom", "mas", "pro", "few", "opt", "poe", "art", "ash", "oar", "cap", "lop",
                                "may", "shy", "rid", "bat", "sum", "rim", "fee", "bmw", "sky", "maj", "hue", "thy",
                                "ava", "rap", "den", "fla", "auk", "cox", "ibo", "hey", "saw", "vim", "sec", "ltd",
                                "you", "its", "tat", "dew", "eva", "tog", "ram", "let", "see", "zit", "maw", "nix",
                                "ate", "gig", "rep", "owe", "ind", "hog", "eve", "sam", "zoo", "any", "dow", "cod",
                                "bed", "vet", "ham", "sis", "hex", "via", "fir", "nod", "mao", "aug", "mum", "hoe",
                                "bah", "hal", "keg", "hew", "zed", "tow", "gog", "ass", "dem", "who", "bet", "gos",
                                "son", "ear", "spy", "kit", "boy", "due", "sen", "oaf", "mix", "hep", "fur", "ada",
                                "bin", "nil", "mia", "ewe", "hit", "fix", "sad", "rib", "eye", "hop", "haw", "wax",
                                "mid", "tad", "ken", "wad", "rye", "pap", "bog", "gut", "ito", "woe", "our", "ado",
                                "sin", "mad", "ray", "hon", "roy", "dip", "hen", "iva", "lug", "asp", "hui", "yak",
                                "bay", "poi", "yep", "bun", "try", "lad", "elm", "nat", "wyo", "gym", "dug", "toe",
                                "dee", "wig", "sly", "rip", "geo", "cog", "pas", "zen", "odd", "nan", "lay", "pod",
                                "fit", "hem", "joy", "bum", "rio", "yon", "dec", "leg", "put", "sue", "dim", "pet",
                                "yaw", "nub", "bit", "bur", "sid", "sun", "oil", "red", "doc", "moe", "caw", "eel",
                                "dix", "cub", "end", "gem", "off", "yew", "hug", "pop", "tub", "sgt", "lid", "pun",
                                "ton", "sol", "din", "yup", "jab", "pea", "bug", "gag", "mil", "jig", "hub", "low",
                                "did", "tin", "get", "gte", "sox", "lei", "mig", "fig", "lon", "use", "ban", "flo",
                                "nov", "jut", "bag", "mir", "sty", "lap", "two", "ins", "con", "ant", "net", "tux",
                                "ode", "stu", "mug", "cad", "nap", "gun", "fop", "tot", "sow", "sal", "sic", "ted",
                                "wot", "del", "imp", "cob", "way", "ann", "tan", "mci", "job", "wet", "ism", "err",
                                "him", "all", "pad", "hah", "hie", "aim", "ike", "jed", "ego", "mac", "baa", "min",
                                "com", "ill", "was", "cab", "ago", "ina", "big", "ilk", "gal", "tap", "duh", "ola",
                                "ran", "lab", "top", "gob", "hot", "ora", "tia", "kip", "han", "met", "hut", "she",
                                "sac", "fed", "goo", "tee", "ell", "not", "act", "gil", "rut", "ala", "ape", "rig",
                                "cid", "god", "duo", "lin", "aid", "gel", "awl", "lag", "elf", "liz", "ref", "aha",
                                "fib", "oho", "tho", "her", "nor", "ace", "adz", "fun", "ned", "coo", "win", "tao",
                                "coy", "van", "man", "pit", "guy", "foe", "hid", "mai", "sup", "jay", "hob", "mow",
                                "jot", "are", "pol", "arc", "lax", "aft", "alb", "len", "air", "pug", "pox", "vow",
                                "got", "meg", "zoe", "amp", "ale", "bud", "gee", "pin", "dun", "pat", "ten", "mob" };
                List<String> wordlist3 = new LinkedList<>(Arrays.asList(strings3));
                // instance.res = new LinkedList<>();
                // System.out.println(instance.findLadders(beginword3, endword3, wordlist3));
                instance.res = new LinkedList<>();
                System.out.println(instance.findLadders2(beginword3, endword3, wordlist3));
                System.out.println("-----------------------------");

                LeetCode_3_126_2 ins2 = new LeetCode_3_126_2();
                System.out.println("Test2-1....");
                String beginword4 = "hit";
                String endword4 = "cog";
                String[] strings4 = { "hot", "hmt", "dot", "lit", "lig", "dog", "lot", "log", "cog" };
                List<String> wordlist4 = new LinkedList<>(Arrays.asList(strings4));
                System.out.println(ins2.findLadders(beginword4, endword4, wordlist4));
                System.out.println("-----------------------------");
                System.out.println("Test2-2....");
                String beginword5 = "qa";
                String endword5 = "sq";
                String[] strings5 = { "si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln", "tm",
                                "le", "av", "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra", "fa", "yo", "ow",
                                "sn", "ya", "cr", "po", "fe", "ho", "ma", "re", "or", "rn", "au", "ur", "rh", "sr",
                                "tc", "lt", "lo", "as", "fr", "nb", "yb", "if", "pb", "ge", "th", "pm", "rb", "sh",
                                "co", "ga", "li", "ha", "hz", "no", "bi", "di", "hi", "qa", "pi", "os", "uh", "wm",
                                "an", "me", "mo", "na", "la", "st", "er", "sc", "ne", "mn", "mi", "am", "ex", "pt",
                                "io", "be", "fm", "ta", "tb", "ni", "mr", "pa", "he", "lr", "sq", "ye" };

                List<String> wordlist5 = new LinkedList<>(Arrays.asList(strings5));
                System.out.println(ins2.findLadders(beginword5, endword5, wordlist5));
                System.out.println("-----------------------------");

                System.out.println("Test2-3....");
                String beginword6 = "cet";
                String endword6 = "ism";
                String[] strings6 = { "kid", "tag", "pup", "ail", "tun", "woo", "erg", "luz", "brr", "gay", "sip",
                                "kay", "per", "val", "mes", "ohs", "now", "boa", "cet", "pal", "bar", "die", "war",
                                "hay", "eco", "pub", "lob", "rue", "fry", "lit", "rex", "jan", "cot", "bid", "ali",
                                "pay", "col", "gum", "ger", "row", "won", "dan", "rum", "fad", "tut", "sag", "yip",
                                "sui", "ark", "has", "zip", "fez", "own", "ump", "dis", "ads", "max", "jaw", "out",
                                "btu", "ana", "gap", "cry", "led", "abe", "box", "ore", "pig", "fie", "toy", "fat",
                                "cal", "lie", "noh", "sew", "ono", "tam", "flu", "mgm", "ply", "awe", "pry", "tit",
                                "tie", "yet", "too", "tax", "jim", "san", "pan", "map", "ski", "ova", "wed", "non",
                                "wac", "nut", "why", "bye", "lye", "oct", "old", "fin", "feb", "chi", "sap", "owl",
                                "log", "tod", "dot", "bow", "fob", "for", "joe", "ivy", "fan", "age", "fax", "hip",
                                "jib", "mel", "hus", "sob", "ifs", "tab", "ara", "dab", "jag", "jar", "arm", "lot",
                                "tom", "sax", "tex", "yum", "pei", "wen", "wry", "ire", "irk", "far", "mew", "wit",
                                "doe", "gas", "rte", "ian", "pot", "ask", "wag", "hag", "amy", "nag", "ron", "soy",
                                "gin", "don", "tug", "fay", "vic", "boo", "nam", "ave", "buy", "sop", "but", "orb",
                                "fen", "paw", "his", "sub", "bob", "yea", "oft", "inn", "rod", "yam", "pew", "web",
                                "hod", "hun", "gyp", "wei", "wis", "rob", "gad", "pie", "mon", "dog", "bib", "rub",
                                "ere", "dig", "era", "cat", "fox", "bee", "mod", "day", "apr", "vie", "nev", "jam",
                                "pam", "new", "aye", "ani", "and", "ibm", "yap", "can", "pyx", "tar", "kin", "fog",
                                "hum", "pip", "cup", "dye", "lyx", "jog", "nun", "par", "wan", "fey", "bus", "oak",
                                "bad", "ats", "set", "qom", "vat", "eat", "pus", "rev", "axe", "ion", "six", "ila",
                                "lao", "mom", "mas", "pro", "few", "opt", "poe", "art", "ash", "oar", "cap", "lop",
                                "may", "shy", "rid", "bat", "sum", "rim", "fee", "bmw", "sky", "maj", "hue", "thy",
                                "ava", "rap", "den", "fla", "auk", "cox", "ibo", "hey", "saw", "vim", "sec", "ltd",
                                "you", "its", "tat", "dew", "eva", "tog", "ram", "let", "see", "zit", "maw", "nix",
                                "ate", "gig", "rep", "owe", "ind", "hog", "eve", "sam", "zoo", "any", "dow", "cod",
                                "bed", "vet", "ham", "sis", "hex", "via", "fir", "nod", "mao", "aug", "mum", "hoe",
                                "bah", "hal", "keg", "hew", "zed", "tow", "gog", "ass", "dem", "who", "bet", "gos",
                                "son", "ear", "spy", "kit", "boy", "due", "sen", "oaf", "mix", "hep", "fur", "ada",
                                "bin", "nil", "mia", "ewe", "hit", "fix", "sad", "rib", "eye", "hop", "haw", "wax",
                                "mid", "tad", "ken", "wad", "rye", "pap", "bog", "gut", "ito", "woe", "our", "ado",
                                "sin", "mad", "ray", "hon", "roy", "dip", "hen", "iva", "lug", "asp", "hui", "yak",
                                "bay", "poi", "yep", "bun", "try", "lad", "elm", "nat", "wyo", "gym", "dug", "toe",
                                "dee", "wig", "sly", "rip", "geo", "cog", "pas", "zen", "odd", "nan", "lay", "pod",
                                "fit", "hem", "joy", "bum", "rio", "yon", "dec", "leg", "put", "sue", "dim", "pet",
                                "yaw", "nub", "bit", "bur", "sid", "sun", "oil", "red", "doc", "moe", "caw", "eel",
                                "dix", "cub", "end", "gem", "off", "yew", "hug", "pop", "tub", "sgt", "lid", "pun",
                                "ton", "sol", "din", "yup", "jab", "pea", "bug", "gag", "mil", "jig", "hub", "low",
                                "did", "tin", "get", "gte", "sox", "lei", "mig", "fig", "lon", "use", "ban", "flo",
                                "nov", "jut", "bag", "mir", "sty", "lap", "two", "ins", "con", "ant", "net", "tux",
                                "ode", "stu", "mug", "cad", "nap", "gun", "fop", "tot", "sow", "sal", "sic", "ted",
                                "wot", "del", "imp", "cob", "way", "ann", "tan", "mci", "job", "wet", "ism", "err",
                                "him", "all", "pad", "hah", "hie", "aim", "ike", "jed", "ego", "mac", "baa", "min",
                                "com", "ill", "was", "cab", "ago", "ina", "big", "ilk", "gal", "tap", "duh", "ola",
                                "ran", "lab", "top", "gob", "hot", "ora", "tia", "kip", "han", "met", "hut", "she",
                                "sac", "fed", "goo", "tee", "ell", "not", "act", "gil", "rut", "ala", "ape", "rig",
                                "cid", "god", "duo", "lin", "aid", "gel", "awl", "lag", "elf", "liz", "ref", "aha",
                                "fib", "oho", "tho", "her", "nor", "ace", "adz", "fun", "ned", "coo", "win", "tao",
                                "coy", "van", "man", "pit", "guy", "foe", "hid", "mai", "sup", "jay", "hob", "mow",
                                "jot", "are", "pol", "arc", "lax", "aft", "alb", "len", "air", "pug", "pox", "vow",
                                "got", "meg", "zoe", "amp", "ale", "bud", "gee", "pin", "dun", "pat", "ten", "mob" };
                List<String> wordlist6 = new LinkedList<>(Arrays.asList(strings6));
                System.out.println(ins2.findLadders(beginword6, endword6, wordlist6));
                System.out.println("-----------------------------");
        }
}