class Nizi {
    public static void main(String[] args) {
        String niz = "vrednost";
        String niz2 = new String(niz);
        String nizPrazen = null;
        String nizPrazen2 = "";

        if (nizPrazen != null) {
            System.out.println(nizPrazen.concat("žnj"));
        }
        //System.out.println(nizPrazen.concat("abc"));
        System.out.println(nizPrazen2.concat("abc"));

        //charAt
        String nizCharAt = "charAt";
        System.out.println(nizCharAt.charAt(2));

        //compareTo
        String nizCompareTo = "compareTo";
        System.out.println(nizCompareTo.compareTo(nizCharAt));

        //concat
        String nizConcat = "concat";
        System.out.println(nizConcat.concat(" dodano na konec"));

        //contains
        String nizContains = "contains";
        System.out.println(nizContains.contains("co"));
        System.out.println(nizContains.contains("st"));

        //endsWith - startsWith
        String nizEndsWith = "endsWith";
        System.out.println(nizEndsWith.endsWith("ith"));
        System.out.println(nizEndsWith.startsWith("star"));

        //split
        String[] vrednosti = "Avtobusi na progi 5 bodo jutri vozili po prilagojenem voznem redu.".split(" ");
        System.out.println(vrednosti.length);
        System.out.println(vrednosti[1]);
        System.out.println(vrednosti[5]);

        //join
        String nizJoin = String.join(" ", vrednosti[0], vrednosti[6]);
        System.out.println(nizJoin);

        //replace - replaceAll
        System.out.println("creda".replace('c', 's'));
        System.out.println("francinabalanci".replaceAll("franci", "buki"));

        //trim
        System.out.println("    MAN    ".trim().concat(" Lion's City 12E"));

        //toUpperCase - toLowerCase
        System.out.println("toUpperCase".toUpperCase());
        System.out.println("toLowerCase".toLowerCase());

    }
}