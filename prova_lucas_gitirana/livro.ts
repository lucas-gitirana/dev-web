type Livro = {
    title: string,
    author: string,
    pages: number
}

function getBookSumary(book: Livro) {
    console.log(`Resumo: ${book.title} - ${book.author} - ${book.pages} páginas.`);
}

let book: Livro = {
    title: 'Sapiens',
    author: 'Yuval Noah Harari',
    pages: 320
};

getBookSumary(book);
