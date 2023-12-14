// install: https://www.npmjs.com/package/http-server
// start: npx http-server
const getAPIKey = () => {
    return '<APIKEY>'
}


const loadNews = async () => {
    const searchTerm = document.getElementById('search-field').value
    console.log(searchTerm)
    const url = 'https://newsapi.org/v2/everything?' +
    `q=${searchTerm}&` +
    'from=2023-12-12&' +
    'sortBy=popularity&' +
    `apiKey=${getAPIKey()}`

    const response = await fetch(url)
    const results = await response.json()
    console.log(results)
    displayNews(results.articles)
}

const displayNews = (articles) => {
    let html = ''
    articles.forEach(article => {
        html += `<h1><a href="${article.url}">${article.title}</a></h1>` +'\n'
        html += `<p>${article.content}</p>` + '\n'
    })
    console.log(html)
    document.getElementById('search-results').innerHTML = html
}