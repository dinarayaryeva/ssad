package com.company.httpMessages.SearchRequest;

public abstract class SearchRequest extends Request {
    public String requestType;
    public String query;
    public Integer pagesCount;
}
