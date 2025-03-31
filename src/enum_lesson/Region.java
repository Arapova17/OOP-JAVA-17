package enum_lesson;

public enum Region {
    Chuy {
        @Override
        public Region feature() {
            System.out.println("Munara");
            return null;
        }
    },
    Yssyk_Kol {
        @Override
        public Region feature() {
            System.out.println("Kol");
            return null;
        }
    },
    Talas {
        @Override
        public Region feature() {
            System.out.println("Manas");
            return null;
        }
    },
    Naryn {
        @Override
        public Region feature() {
            System.out.println("Naryn darya");
            return null;
        }
    },
    Jalal_Abad {
        @Override
        public Region feature() {
            System.out.println("Arslanbab");
            return null;
        }
    },
    Osh {
        @Override
        public Region feature() {
            System.out.println("Sulaiman too");
            return null;
        }
    },
    Batken {
        @Override
        public Region feature() {
            System.out.println("Aigul gul");
            return null;
        }
    };

    public abstract Region feature();
}
