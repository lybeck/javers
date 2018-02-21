package org.javers.core.example;

import org.javers.core.metamodel.annotation.Id;

/**
 *
 * @author llybeck
 */
class KeyObject {

    @Id
    private final KeyHolder key;

    public KeyObject(int n, int m) {
        this.key = new KeyHolder(n, m);
    }

    @Override
    public String toString() {
        return key.toString();
    }

    public int getN() {
        return key.n;
    }

    public int getM() {
        return key.m;
    }

    private static class KeyHolder {

        private final int n;
        private final int m;

        public KeyHolder(int n, int m) {
            this.n = n;
            this.m = m;
        }

        @Override
        public String toString() {
            return "(" + n + "," + m + ")";
        }
    }
}
