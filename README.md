# Bangalore Clojure Group Website

[Visit the Website](https://bangalore-clj.github.io/)


## About

The Bangalore Clojure Group hosts one of the most active (since 2010) Clojure meetups in India. All of our meetups are conducted at different locations with different set of speakers every month. Our meetups are scheduled conveniently on every first Saturday of the month.

Our meetups usually have talks by Clojurists, but we organise hackathons on regular basis as well. We are an open community. We encourage and welcome all Clojurists and functional-programming enthusiasts to join us.

Please reach out to us if you have any thoughts on what we can do together or how we can help one another.

Ways to reach us:
- [clojurians slack](https://clojurians.herokuapp.com/): #bangalore-clj channel
- [Google group](https://groups.google.com/forum/#!forum/bangalore-clj)
- Email: `bangaloreclojure@gmail.com`


## Contribute

Please send a pull-request for any contribution. Below are different ways to contribute. Before sending PRs, please test the changes by running the application on your local machine:
```
lein ring server
```

This website has been built using [Cryogen](http://cryogenweb.org/index.html). You can visit the detailed documentation at [Cryogen documentation](http://cryogenweb.org/docs/home.html) page in case you have any doubts. Or, you can email us on `bangaloreclojure@gmail.com`


## Writing a post (article)

To add a post, please put your content inside a markdown (.md) file. Name that file as `<YYYY-MM-DD>-file-name.md`
Then, put this file in the `resources/templates/md/posts` directory.

You can add a settings map on top of the markdown (.md) file as below:
```
{:title "This is a demo post"
 :layout :post
 :tags  ["Clojure" "ClojureScript"]
 :author "your-name"}
```


## Creating a page (ex: About, Contribute, etc.)

To add a page, please put your content inside a markdown (.md) file. Name that file as `file-name.md`
Then, put this file in the `resources/templates/md/pages` directory.

You can add a settings map on top of the MD file as below:
```
{:title "Contribute"
 :layout :page
 :page-index 0
 :navbar? true}
```


## Making changes to the website (structure, looks, etc)

1. Base config can be modified at `resources/templates/config.edn`.

2. CSS and Layouts for the currently used `blue` theme can be modified at `resources/templates/themes/blue`.
