(ns sicp-clj.ch-1.factorial-iter)

(defn fact-iter [product counter max-count]
  (if (> counter max-count)
    product
    (fact-iter
     (* counter product)
     (+ counter 1)
     max-count)))

(defn factorial [n]
  (fact-iter 1 1 n))
