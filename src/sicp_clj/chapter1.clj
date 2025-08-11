(ns sicp-clj.chapter1
  (:require [sicp-clj.chapter1.sqrt :as sqrt]
            [sicp-clj.chapter1.excs-new-if :as new-sqrt]))

;; Re-export main functions for convenience
(def sqrt sqrt/sqrt)
(def new-sqrt new-sqrt/new-sqrt)
