---
layout: default
title: arc42
subtitle: software architecture
---

# what is arc42?

**arc42** supports software- and system architects. It is based upon practical experience of many architecture projects of different sizes and domains. It includes feedback of its many users.

**arc42** contains a template for development, documentation and communication of software architectures.

**arc42** fits arbitrary technologies and tools.

**arc42** therefore ensures better software- and system architectures.

Together with **arc42** we propose a lightweight set of activities (process) for effective construction and development of software architectures.

You can use **arc42** for free, even for commercial applications. We are happy when you quote us.

----

# examples

This is a list of all known public available examples of arc42 documentation.
Feel free to contact us if you have a link to another example.

[HTML Sanity Checker](http://aim42.github.io/htmlSanityCheck/hsc_arc42.html) (Englisch)  
Verbose example for the documentation of a Gradle plugin, created by Dr. Gernot Starke.

[DocChess](http://www.dokchess.de/dokchess/arc42/) (German)  
Verbose example for a chess engine, created by Stefan Z&ouml;rner. There is also a book available which describes the creation of this example.

[Gradle](http://www.embarc.de/arc42-starschnitt-gradle/) (German)  
A series of blog posts which describe certain aspects of Gradle and put them into context of arc42. Created by Stefan Z&ouml;rner.

[Financial Data Migration](http://confluence.arc42.org/display/migrationEg/Financial+Data+Migration) (mostly English)

----

# downloads

Currently there are two sources for downloads...

**Confluence** - on our confluence landing page you'll find docx and confluence templates in German, English and Spanish:

<p>
  <section id="confluence" class="clearfix" >
    <a href="http://confluence.arc42.org/display/LANDINGZON/landing+zone" id="download" class="button"><span>Confluence</span></a>
  </section>
</p>

**GitHub** - on GitHub you'll find the new AsciiDoc version of the template together with a project which converts the AsciiDoc template into several other formats. These templates are currently available in English and German:

<p>
  <section id="downloads-section" class="clearfix">
    <a href="https://github.com/arc42/arc42-template" id="view-on-github" class="button"><span>Templates</span></a>
  </section>
</p>	

Here are all templates derived from the AsciiDoc templates in a single overview:

{% assign formats = "asciidoc|docbook|docx|epub|html|markdown|textile" | split: "|"  %}  
{% assign types = "plain|withhelp" | split: "|"  %}  
| Format | Language | Plain | With Help |
|--------|----------|-------|-----------|
{% for format in formats %}| {{ format }} | EN | {% for type in types %} [.zip](https://github.com/arc42/arc42-template/blob/gh-pages/dist/arc42-template-EN-{{type}}-{{format}}.zip?raw=true) |{% endfor %}
|  | DE | {% for type in types %} [.zip](https://github.com/arc42/arc42-template/blob/gh-pages/dist/arc42-template-DE-{{type}}-{{format}}.zip?raw=true) |{% endfor %}{% endfor %}

----

# other related sites and literature

## sites

[arc42.de](http://arc42.de) (German) and [arc42.org](http://arc42.org) (English) are the main sites where you can find more background details about the template, trainings and literature.

## books

Gernot Starke:  
Effektive Softwarearchitekturen - Ein praktischer Leitfaden.  
Carl Hanser Verlag, 6, Auflage 2014.  
ISBN [978-3446436145](https://www.google.de/search?q=978-3446436145)  

Gernot Starke und Peter Hruschka:  
Softwarearchitektur kompakt.  
Springer Akademischer Verlag, 2. Auflage 2011.  
ISBN [978-3827428349](https://www.google.de/search?q=978-3827428349)  

Stefan Z&ouml;rner:  
Softwarearchitekturen dokumentieren und kommunizieren.  
Carl Hanser Verlag, 2012.  
ISBN [978-3446443488](https://www.google.de/search?q=978-3446443488)  
