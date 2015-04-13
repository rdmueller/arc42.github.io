def formats=['AsciiDoc', 'DocBook', 'docx', 'epub', 'HTML', 'MarkDown', 'Textile']
def languages=['DE','EN']
def types=['plain','withhelp']
formats.each { format ->
    languages.eachWithIndex { language, i ->
        println "    <tr>"
        println "        <td>${i%2==0?format:''}</td>"
        println "        <td>${language}</td>"
        types.each { type ->
            println "        <td><a href='https://github.com/arc42/arc42-template/blob/gh-pages/dist/arc42-template-${language}-${type}-${format.toLowerCase()}.zip?raw=true'>.zip</a></td>"
        }
        println "    </tr>"
    }
}
""
