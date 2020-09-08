public enum Level {
    LOW {
        public Level nextLevel() {
            return MEDIUM;
        }
    },
    MEDIUM {
        public Level nextLevel() {
            return HIGH;
        }
    },
    HIGH {
        public Level nextLevel() {
            return HIGH;
        }
    };
    public abstract Level nextLevel();
    public static void main(String[] args) {
        Level l = LOW;
        System.out.println(l);
        System.out.println(l.nextLevel());
        System.out.println(l.nextLevel().nextLevel());
        System.out.println(l.ordinal());
    }
}
