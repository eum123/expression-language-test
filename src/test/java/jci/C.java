package jci;

public class C {
    private String name;

    private C(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static CBuilder builder() {
        return new CBuilder();
    }

    public static class CBuilder {
        private String name;

        public CBuilder name(String name) {
            this.name = name;
            return this;
        }

        public C build() {
            return new C(this.name);
        }
    }
}
