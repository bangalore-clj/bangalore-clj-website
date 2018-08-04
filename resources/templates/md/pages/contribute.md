{:title "Contribute"
 :layout :page
 :page-index 0
 :navbar? true}

## General

Please send a pull-request for any contribution. Below are different ways to contribute.
Before sending PRs, please test the changes well: `lein ring server`

This website has been built using [Cryogen](http://cryogenweb.org/index.html). You can visit the detailed documentation at [Cryogen documentation](http://cryogenweb.org/docs/home.html) page in case you have any doubts. Or, you can email us on `bangaloreclojure@gmail.com`



## Writing a post (article)

To add a post, please put your content inside a markdown (.md) file. Name that file as `<YYYY-MM-DD>-file-name.md`
Then, put this file in the `resources/templates/md/posts` directory.

You can add a seetings map on top of the MD file as below:
```
{:title "This is a demo post"
 :layout :post
 :tags  ["Clojure" "ClojureScript"]
 :toc true}
```


## Creating a page (ex: About, Contribute, etc.)

To add a page, please put your content inside a markdown (.md) file. Name that file as `file-name.md`
Then, put this file in the `resources/templates/md/pages` directory.

You can add a seetings map on top of the MD file as below:
```
{:title "Contribute"
 :layout :page
 :page-index 0
 :navbar? true}
```


## Making changes to the website (structure, looks, etc)

You can modify the base config at `resources/templates/config.edn`.

CSS and Layouts can be modified from `resources/templates/themes`.





