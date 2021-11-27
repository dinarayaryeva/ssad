package com.company.serverManager;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Lexicon.Lexicon;
import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.searchEngine.Models.Index.WordIndex;
import com.company.seoSuggester.SEOProblemCollection.MetaTagsUsage.MetaTagsUsage;
import com.company.seoSuggester.SEOProblemCollection.MetaTagsUsage.PageDescriptionUsage;
import com.company.seoSuggester.SEOProblemCollection.MetaTagsUsage.TitleUsage;
import com.company.seoSuggester.SEOProblemCollection.SEOProblemCollection;
import com.company.seoSuggester.SEOProblems.DescriptionNotFoundProblem;
import com.company.seoSuggester.SEOProblems.TitleLengthProblem;
import com.company.seoSuggester.SEOSuggestions.DescriptionNotFoundSuggestion;
import com.company.seoSuggester.SEOSuggestions.TitleLengthSuggestion;
import com.company.utils.PlainDocument;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Elements.Element;
import com.company.utils.htmlParser.Elements.Header1;
import com.company.utils.htmlParser.Elements.Paragraph;
import com.company.utils.htmlParser.Elements.Title;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;


public class ServerManager {
    /**
     * Server connection mock class
     */

    private static ArrayList<DocumentIndex> docIndices;
    private static ArrayList<WordIndex> wordIndices;

    public ServerManager() {
        if (docIndices != null) {
            return;
        }

        //Creating mock document indices. In real project they should be created by indexer.
        ArrayList<Element> doc1ELements = new ArrayList<>();
        Element doc1Title = new Title("Document1 title");
        Element doc1Header1_1 = new Header1("Document1 header1");
        Element doc1Paragraph1 = new Paragraph("Document1 paragraph1 Document1 paragraph1" +
                " Document1 paragraph1 Document1 paragraph1 Document1 paragraph1 Document1 paragraph1");
        Element doc1Paragraph2 = new Paragraph("Documen1 paragraph2 Documen1 paragraph2" +
                "Documen1 paragraph2 Documen1 paragraph2 Documen1 paragraph2 Documen1 paragraph2");

        doc1ELements.add(doc1Title);
        doc1ELements.add(doc1Header1_1);
        doc1ELements.add(doc1Paragraph1);
        doc1ELements.add(doc1Paragraph2);

        Document doc1 = new Document(doc1ELements);
        DocumentIndex doc1Index = new DocumentIndex(doc1, "http://document1f.ext");

        Element doc2Title = new Title("Document2 title");
        Element doc2Header1_1 = new Header1("Document2 header1");
        Element doc2Paragraph1 = new Paragraph("Document2 paragraph1 Document2 paragraph1" +
                " Document2 paragraph1 Document2 paragraph1 Document2 paragraph1 Document2 paragraph1");
        Element doc2Paragraph2 = new Paragraph("Document2 paragraph2 Document2 paragraph2" +
                "Document2 paragraph2 Document2 paragraph2 Document2 paragraph2 Document2 paragraph2");


        ArrayList<Element> doc2ELements = new ArrayList<>();
        doc2ELements.add(doc1Title);
        doc2ELements.add(doc1Header1_1);
        doc2ELements.add(doc1Paragraph1);
        doc2ELements.add(doc1Paragraph2);

        Document doc2 = new Document(doc1ELements);
        DocumentIndex doc2Index = new DocumentIndex(doc2, "http://document2.ext");


        docIndices = new ArrayList<>();
        docIndices.add(doc1Index);
        docIndices.add(doc2Index);

        if (wordIndices != null) {
            return;
        }

        //Creating mock word indices. In real project they should be created by sorter.

        //Word index for word "document1"
        ArrayList<Integer> word1DocIds = new ArrayList<>();
        word1DocIds.add(1);
        WordIndex word1Index = new WordIndex(1, word1DocIds);

        //Word index for word "paragraph1"
        ArrayList<Integer> word2DocIds = new ArrayList<>();
        //Word with id 2 appears in documents with id 1 and 2
        word2DocIds.add("http://document1.ext".hashCode());
        word2DocIds.add("http://document2.ext".hashCode());
        WordIndex word2Index = new WordIndex(2, word2DocIds);

        //Word index for word "document2"
        ArrayList<Integer> word3DocIds = new ArrayList<>();
        word3DocIds.add(2);
        WordIndex word3Index = new WordIndex(3, word3DocIds);

        //Word index for word "paragraph2"
        ArrayList<Integer> word4DocIds = new ArrayList<>();
        //Word with id 2 appears in documents with id 1 and 2
        word2DocIds.add(1);
        word2DocIds.add(2);
        WordIndex word4Index = new WordIndex(4, word2DocIds);

        //Word index for word "header1"
        ArrayList<Integer> word5DocIds = new ArrayList<>();
        //Word with id 2 appears in documents with id 1 and 2
        word5DocIds.add(1);
        word5DocIds.add(2);
        WordIndex word5Index = new WordIndex(5, word2DocIds);

        //Filling list of inverted indices
        wordIndices = new ArrayList<>();
        wordIndices.add(word1Index);
        wordIndices.add(word2Index);
        wordIndices.add(word3Index);
        wordIndices.add(word4Index);
        wordIndices.add(word5Index);
    }
    public SEOProblemCollection getSEOConfig() {

        SEOProblemCollection seoConfig = new SEOProblemCollection();

        MetaTagsUsage metaTagsUsage = new MetaTagsUsage();

        TitleUsage titleUsage = new TitleUsage();
        TitleLengthProblem titleLengthProblem = new TitleLengthProblem();
        TitleLengthSuggestion titleLengthSuggestion = new TitleLengthSuggestion();
        titleLengthProblem.addComponent(titleLengthSuggestion);
        titleUsage.addComponent(titleLengthProblem);

        PageDescriptionUsage descriptionUsage = new PageDescriptionUsage();
        DescriptionNotFoundProblem descriptionNotFoundProblem = new DescriptionNotFoundProblem();
        DescriptionNotFoundSuggestion descriptionNotFoundSuggestion = new DescriptionNotFoundSuggestion();
        descriptionNotFoundProblem.addComponent(descriptionNotFoundSuggestion);
        descriptionUsage.addComponent(descriptionNotFoundProblem);

        metaTagsUsage.addComponent(titleUsage);
        metaTagsUsage.addComponent(descriptionUsage);
        seoConfig.addComponent(metaTagsUsage);

        return seoConfig;
    }

    public SEOProblemCollection updateSEOConfig() {
        return new SEOProblemCollection();
    }


    // Indexing

    public void storeIndex(DocumentIndex index) {}

    public void updateIndex(DocumentIndex index) {}

    //TODO SEOConfig iterator for max score
    public int getFullSeoScore() {
        return 50;
    }

    public String getPlainDocument(int plainDocId) {
        return "";
    }

    public ArrayList<DocumentIndex> fetchMatchingIndices(String query) {

        return new ArrayList<DocumentIndex>();
    }

    /**
     * Obtain documents that contain specified keywords
     * @param keywords
     * @return
     */
    public ArrayList<DocumentIndex> fetchMatchingIndices(ArrayList<String> keywords) {

        //Convert each keyword to it's id (ids are stores in the lexicon)
        ArrayList<Integer> wordIds = (ArrayList<Integer>) keywords.stream()
                .map(x -> Lexicon.getWordId(x))
                .collect(Collectors.toList());

        //Find ids of documents containing words with specific ids
        ArrayList<Integer> docIds = (ArrayList<Integer>) wordIndices.stream()
                .filter(wordInd -> wordIds.contains(wordInd.getWordId()))
                .map(wordInd -> wordInd.getDocIds())
                .flatMap(docInds -> docInds.stream())
                .distinct()
                .collect(Collectors.toList());

        //Obtain document indices by their ids
        ArrayList<DocumentIndex> docInds = (ArrayList<DocumentIndex>) docIndices.stream()
                .filter(ind -> docIds.contains(ind.getDocId()))
                .collect(Collectors.toList());
        return docInds;
    }

    public void storeUrlsOnUrlServer(String url) {
    }
    // Working with url server

    public void storeUrlsOnUrlServer(InputStream is) {}

    public void storeUrlOnUrlServer(String url) {}

    public ArrayList<String> fetchUrlsList() {
        return new ArrayList<String>();
    }

    // Working with documents and indexes
    public void storePlainDocument(PlainDocument doc) {
    }

    public ArrayList<DocumentIndex> getDocumentIndexes() {
        return new ArrayList<DocumentIndex>();
    }
    

    public void updateWordIndex(WordIndex wordIndex) {
    }

    public void createWordIndex(WordIndex index) {
    }


    // Working with lexicon
    public HashMap<String, Integer> getLexicon() {

        HashMap<String, Integer> lexicon = new HashMap<String, Integer>();

        //Filling lexicon with some words to search pages based on their occurrences
        lexicon.put("document1", 1);
        lexicon.put("paragraph1", 2);
        lexicon.put("document2", 3);
        lexicon.put("paragraph2", 4);
        lexicon.put("header1", 5);

        return lexicon;
    }

    public void updateLexicon(ArrayList<WordIndex> lexicon) {
    }

    // Working with analytics
    public void gatherSearchAnalytics(SearchRequest request, SearchResponse response) {

    }

}
