function getBookSumary(book) {
    console.log("Resumo: ".concat(book.title, " - ").concat(book.author, " - ").concat(book.pages, " p\u00E1ginas."));
}
var book = {
    title: 'Sapiens',
    author: 'Yuval Noah Harari',
    pages: 320
};
getBookSumary(book);
