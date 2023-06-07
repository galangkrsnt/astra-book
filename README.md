
## Installation

```
Buat schema pada database postgresql dengan nama 'astra'
Sesuaikan postgresl url dan nama database file file astra/src/main/resource/application.yml dengan format
jdbc:postgresql://{{URL}}:{{PORT}}/{{NAMA_DB}}
```

## Run

Untuk menjalankan program ketikan peirintah command line berikut

```
$ cd astra/
$ mvn spring-boot:run
```

## API List

Daftar Api terdapat pada file json postman collection dengan keterangan sebagai berikut

```
Get All Books --> mengambil semua data buku
Get Book by Status --> mengambil data buku berdasarkan status pada request body
Add Book --> Menambahkan data buku
Delete Book --> Menghapus data buku berdasarkan variable id pada url
Update Data Buku --> Update data buku berdasarkan id buku pada request body
Update Status Buku --> Update status buku berdasarkan id buku pada request body
```
