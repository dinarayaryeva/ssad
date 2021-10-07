package com.company.searchEngine.Sorter;

import com.company.searchEngine.Indexer.Indexer;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.searchEngine.Models.Hit.Hit;
import com.company.searchEngine.Models.Hit.HitsInfo;
import com.company.searchEngine.Models.Index.WordIndex;
import com.company.serverManager.ServerManager;

import java.util.ArrayList;

public class Sorter {
    ServerManager dataServerConnection;
    LexiconManager lexiconManager;

    public void updateWordIndex(WordIndex wordIndex){
        int wordId = wordIndex.getWordId();
        ArrayList<DocumentIndex> documentIndexes = dataServerConnection.getDocumentIndexes();

        ArrayList<HitsInfo> hitsInfos = new ArrayList<>();
        for(DocumentIndex documentIndex: documentIndexes){
            Hit[] hitList = documentIndex.getHitList(wordId);
            HitsInfo hitsInfo = new HitsInfo(documentIndex.getDocId(), hitList);
            hitsInfos.add(hitsInfo);
        }
        wordIndex.setHitsInfo((HitsInfo[]) hitsInfos.toArray());
        dataServerConnection.updateWordIndex(wordIndex);
    }

    public WordIndex makeWordIndex(int wordId){
        ArrayList<DocumentIndex> documentIndexes = dataServerConnection.getDocumentIndexes();
        WordIndex index = new WordIndex(wordId);
        ArrayList<HitsInfo> hitsInfos = new ArrayList<>();
        for(DocumentIndex documentIndex: documentIndexes){
            Hit[] hitList = documentIndex.getHitList(wordId);
            HitsInfo hitsInfo = new HitsInfo(documentIndex.getDocId(), hitList);
            hitsInfos.add(hitsInfo);
        }
        index.setHitsInfo((HitsInfo[]) hitsInfos.toArray());
        dataServerConnection.createWordIndex(index);
        return index;

    }
}
