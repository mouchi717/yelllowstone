FROM mysql:5.7

# MySQL設定ファイルをイメージ内にコピー
ADD ./my.cnf /etc/mysql/conf.d/my.cnf

# TimeZoneの設定
ENV TZ='Asia/Tokyo'

# ポートを開ける
EXPOSE 3306

#docker runに実行される
CMD ["mysqld"]