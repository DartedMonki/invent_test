# Langkah-Langkah GIT

Berikut adalah beberapa git command yang penting.

## Init

Menjadikan directory yang ada menjadi sebuah repository git baru
```bash
git init
```

Melakukan clone repository git yang sudah ada
```bash
git clone [url]
```

## Push, Pull, dan Merge
Melihat file mana saja yang telah dilakukan perubahan
```bash
git status
```
Stage setiap file yang telah diubah, siap untuk dilakukan commit
```bash
git add .
```
Melakukan commit
```bash
git commit -m “[pesan commit]”
```
Melakukan push ke branch master
```bash
git push origin master
```
Melakukan pull
```bash
git pull
```
Melakukan merge ke branch master
```bash
git merge origin/master
```
