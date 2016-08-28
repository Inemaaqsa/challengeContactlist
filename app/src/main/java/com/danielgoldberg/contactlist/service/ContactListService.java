package com.danielgoldberg.contactlist.service;

import com.danielgoldberg.contactlist.model.Contact;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ContactListService {
    @GET("/external/contacts.json")
    Call<List<Contact>> getContacts();

    @GET
    Call<Contact> getContact(@Url String detailsURL);
}
