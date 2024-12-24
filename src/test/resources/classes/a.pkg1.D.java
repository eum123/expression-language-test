
package a.pkg1;

public class D {
    public void aaa() {
        C ccc = C.builder()
                .name("hong")
                .build();

        System.out.println(ccc.getName());
    }
}