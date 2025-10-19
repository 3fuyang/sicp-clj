(ns sicp-clj.ch-2.2-28
  (:require [sicp-clj.ch-2.list :refer [car, cdr, append]]))

;; ((1 2) (3 4))
;; -> (1 2 3 4)
(defn fringe [tree]
  (defn helper [t rs]
    (if (empty? t) rs
        (let [cur (car t)]
          (helper (cdr t)
                  (append rs
                          (if (list? cur) (fringe cur)
                              (list cur)))))))
  (helper tree nil))

(def x (list (list 1 2) (list 3 4)))
(println (fringe x))
