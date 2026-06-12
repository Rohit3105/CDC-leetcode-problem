class Solution {
    public boolean hasMatch(String s, String p) {
       int start = p.indexOf('*');
       String first = p.substring(0,start);
       String last = p.substring(start+1);
       int pos = s.indexOf(first);
       if(pos==-1) return false;
       String rem = s.substring(pos+first.length());
       return rem.contains(last); 
    }
}