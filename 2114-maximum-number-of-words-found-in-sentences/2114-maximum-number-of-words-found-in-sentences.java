class Solution {
    public int mostWordsFound(String[] sentences) {
        int spacesHigh = 0;
        
        for(int i = 0; i < sentences.length; i++){
            int sentenceSpaces = 0;
            
            for(char character : sentences[i].toCharArray()){
                if(character == ' '){
                    sentenceSpaces++;
                }
                
                if(sentenceSpaces > spacesHigh){
                    spacesHigh = sentenceSpaces;
                }
            }
        }
        return spacesHigh + 1;
    }
}