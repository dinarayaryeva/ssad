package com.company.searchEngine.Sorter;

import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.searchEngine.Models.Index.WordIndex;

import java.util.ArrayList;

public class WordSorter extends Sorter {
//    public WordIndex makeWordIndex(int wordId){
//        ArrayList<DocumentIndex> documentIndexes = dataServerConnection.getDocumentIndexes();
//        WordIndex index = new WordIndex(wordId);
//        ArrayList<HitsInfo> hitsInfos = new ArrayList<>();
//        for(DocumentIndex documentIndex: documentIndexes){
//            Hit[] hitList = documentIndex.getHitList(wordId);
//            HitsInfo hitsInfo = new HitsInfo(documentIndex.getDocId(), hitList);
//            hitsInfos.add(hitsInfo);
//        }
//        index.setHitsInfo((HitsInfo[]) hitsInfos.toArray());
//        dataServerConnection.createWordIndex(index);
//        return index;
//
//        public void updateWordIndex(WordIndex wordIndex){
//
//        }
//    }
}
