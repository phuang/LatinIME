/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.common;

/**
 * Utilities for search implementations.
 *
 * @see android.app.SearchManager
 */
public class Search {

    /**
     * Key for the source identifier set by the application that launched a search intent.
     * The identifier is search-source specific string. It can be used
     * by the search provider to keep statistics of where searches are started from.
     *
     * The source identifier is stored in the {@link android.app.SearchManager#APP_DATA}
     * Bundle in {@link android.content.Intent#ACTION_SEARCH} and
     * {@link android.content.Intent#ACTION_WEB_SEARCH} intents.
     */
    public final static String SOURCE = "source";

    /**
     * Column name for suggestions cursor. <i>Optional.</i> This column may be
     * used to specify the time in {@link System#currentTimeMillis
     * System.currentTimeMillis()} (wall time in UTC) when an item was last
     * accessed within the results-providing application. If set, this may be
     * used to show more-recently-used items first.
     *
     * See {@code SearchManager.SUGGEST_COLUMN_LAST_ACCESS_HINT} in ICS.
     */
    public final static String SUGGEST_COLUMN_LAST_ACCESS_HINT = "suggest_last_access_hint";

    private Search() { }   // don't instantiate
}
