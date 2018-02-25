package project.skripsi.tsalis.content;

import android.content.SearchRecentSuggestionsProvider;


public class PoiSearchRecentSuggestionsProvider extends SearchRecentSuggestionsProvider
{
	public final static String AUTHORITY = "project.skripsi.tsalis.content.PoiSearchRecentSuggestionsProvider";
	public final static int MODE = DATABASE_MODE_QUERIES;


	public PoiSearchRecentSuggestionsProvider()
	{
		setupSuggestions(AUTHORITY, MODE);
	}
}
