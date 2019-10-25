public class change {
    static char[] swap(char n[]) {
        char m[] = n.clone();
        char buf[] = new char[m.length];
        for (int i = 0, j = (buf.length - 1); i < m.length & j >= 0; i++, j--) {
            buf[j] = m[i];
        }
        return buf;
    }
}
