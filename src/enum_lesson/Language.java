package enum_lesson;

public enum Language {
    KYRGYZ {
        @Override
        public void abstractMethod() {

        }
    }, // public static Language KYRGYZ = new Language();
    RUSSIAN {
        @Override
        public void abstractMethod() {

        }
    },
    ENGLISH {
        @Override
        public void abstractMethod() {

        }
    };

    // pole;
    private String name;

    // NoArgsConstructor;
    private Language (){

    }

    // AllArgsConstructor;
    private Language(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void abstractMethod();
}
