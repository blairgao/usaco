package com.usaco;
import java.io.*;
import java.util.StringTokenizer;

/*
    credit to Siyuan Chen https://github.com/chen-siyuan
 */
public class Main {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        System.out.println(in.nextLine());
    }

    public static class FastReader {
        private BufferedReader br;
        private StringTokenizer st;

        public FastReader() {br = new BufferedReader(new InputStreamReader(System.in));}

        public FastReader(String fileName) {
            try {br = new BufferedReader(new FileReader(fileName));}
            catch(FileNotFoundException e) {e.printStackTrace();}
        }

        private String next() {
            while(st == null || !st.hasMoreElements()) {
                try {st = new StringTokenizer(br.readLine());}
                catch(IOException e) {e.printStackTrace();}
            }
            return st.nextToken();
        }

        public int nextInt() {return Integer.parseInt(next());}

        public long nextLong() {return Long.parseLong(next());}

        public double nextDouble() {return Double.parseDouble(next());}

        public String nextString() {return next();}

        public String nextLine() {
            String str = "";
            try {str = br.readLine();}
            catch(IOException e) {e.printStackTrace();}
            return str;
        }

    }
}
