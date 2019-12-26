public class MonoCipher {

    public static void main(String[] ar) {

        char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char [] key = {'x','y','z','w','v','u','t','s','r','p','q','o','a','b','c','d','e','f','g','h','i','j','k','l','m','n'};

        String msg = "Hello";
        msg = msg.toLowerCase();

        char rs [] = new char[msg.length()];

        System.out.println("##Plain Text: " +msg);
        System.out.println("-------------");
        System.out.println("ENCRYPTED : " );

        for(int i=0;i<msg.length();i++){
            for(int j=0;j<26;j++){
                if(alphabet[j]==msg.charAt(i)){
                    rs[i]=key[j];
                    System.out.print(rs[i]);
                }
            }
        }
    }
}