(ns sicp-clj.ch-1.factorial)

(defn factorial [n]
  (if (= n 1)
    1
    (* n (factorial (- n 1)))))
